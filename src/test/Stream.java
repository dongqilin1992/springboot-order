import com.dongqilin.entity.Dish;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/**
 * @description:
 * @author: dongql
 * @date: 2019/9/29 17:42
 */
public class Stream {
    private List<Dish> dishList = new ArrayList<Dish>();

    @Before
    public void init(){
        Dish dish = new Dish();
        dish.setType("川菜");
        dish.setName("红烧肉");
        dish.setCalories(100);
        dishList.add(dish);
        Dish dish2 = new Dish();
        dish2.setType("粤菜");
        dish2.setName("煲仔饭");
        dish2.setCalories(10);
        dishList.add(dish2);
        Dish dish3 = new Dish();
        dish3.setType("湘菜");
        dish3.setName("小炒肉");
        dish3.setCalories(50);
        dishList.add(dish3);
    }
    @Test
    public void test(){
        /*筛选出卡路里小于400的菜肴
         对筛选出的菜肴进行一个排序
        获取排序后菜肴的名字*/
        dishList.stream().filter(d -> d.getCalories() < 200)  //筛选出卡路里小于400的菜肴
                .sorted(comparing(Dish::getCalories))  //根据卡路里进行排序
                .map(Dish::getName)  //提取菜肴名称
                .collect(Collectors.toList())//转换为List
                .forEach(System.out::println);

        dishList.forEach(a -> a.setName(""));
        System.out.println(dishList);
    }

    @Test
    public void test2(){
    //对数据库查询到的菜肴根据菜肴种类进行分类，返回一个Map<Type, List<Dish>>的结果
        Map<String, List<Dish>> collect = dishList.stream().collect(groupingBy(Dish::getType));
        System.out.println(collect);
    }

    @Test
    public void test3(){
        //filter筛选
        List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 4, 5);
        integerList.stream().filter(i -> i >= 3).collect(toList()).forEach(System.out::println);
        System.out.println("---------");
        //distinct去除重复元素
        integerList = Arrays.asList(1, 1, 2, 3, 4, 5);
        integerList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------");
        //limit返回指定流个数
        integerList = Arrays.asList(1, 1, 2, 3, 4, 5);
        integerList.stream().limit(3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------");
        integerList = Arrays.asList(1, 1, 2, 3, 4, 5);
        integerList.stream().skip(2).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------");
        //map流映射
        List<String> stringList = Arrays.asList("Java 8", "Lambdas",  "In", "Action");
        stringList.stream().map(String::length).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------");
        //flatMap流转换,将一个流中的每个值都转换为另一个流
        List<String> wordList = Arrays.asList("He ll o", "W orl d");
        List<String> strList = wordList.stream()
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(strList);
        System.out.println("---------");
        //allMatch匹配所有
        integerList = Arrays.asList(1, 2, 3, 4, 5);
        if (integerList.stream().allMatch(i -> i > 3)) {
            System.out.println("值都大于3");
        } else{
            System.out.println("不存在值都大于3");
        }
        System.out.println("---------");
        //anyMatch匹配其中一个
         integerList = Arrays.asList(1, 2, 3, 4, 5);
        if (integerList.stream().anyMatch(i -> i > 3)) {
            System.out.println("存在大于3的值");
        }
        System.out.println("---------");
        //noneMatch全部不匹配
         integerList = Arrays.asList(1, 2, 3);
        if (integerList.stream().noneMatch(i -> i > 3)) {
            System.out.println("值都小于3");
        }
        System.out.println("---------");
        //统计流中元素个数
        integerList = Arrays.asList(1, 2, 3, 4, 5);
        Long result = integerList.stream().count();
        System.out.println("流中元素个数 " + result);
         integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
         result = integerList.stream().collect(counting());
        System.out.println("流中元素个数 " + result);
        System.out.println("---------");
        //findFirst查找第一个
        integerList = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> results = integerList.stream().filter(i -> i > 3).findFirst();
        System.out.println("查找第一个 " + results);
        System.out.println("---------");
        //findAny随机查找一个
        integerList = Arrays.asList(1, 2, 3, 4, 5);
        results = integerList.stream().filter(i -> i > 1).findAny();
        System.out.println("随机查找一个 " + results);
        System.out.println("---------");
        //reduce将流中的元素组合起来
        int sum = integerList.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("元素相加 " + sum);
        sum = integerList.stream().reduce(0, Integer::sum);
        System.out.println("元素相加 " + sum);
        System.out.println("---------");
        //获取流中最小最大值
        Optional<Integer> min = dishList.stream().map(Dish::getCalories).min(Integer::compareTo);
        Optional<Integer> max = dishList.stream().map(Dish::getCalories).max(Integer::compareTo);
        System.out.println("最大 " + max + " 最小 " + min);
        OptionalInt mins = dishList.stream().mapToInt(Dish::getCalories).min();
        OptionalInt maxs = dishList.stream().mapToInt(Dish::getCalories).max();
        System.out.println("最大 " + maxs + " 最小 " + mins);
         min = dishList.stream().map(Dish::getCalories).collect(minBy(Integer::compareTo));
         max = dishList.stream().map(Dish::getCalories).collect(maxBy(Integer::compareTo));
        System.out.println("最大 " + maxs + " 最小 " + mins);
         min = dishList.stream().map(Dish::getCalories).reduce(Integer::min);
         max = dishList.stream().map(Dish::getCalories).reduce(Integer::max);
        System.out.println("最大 " + maxs + " 最小 " + mins);
        System.out.println("---------");
        //求和
        sum = dishList.stream().collect(summingInt(Dish::getCalories));
        System.out.println("求和 " + sum);
        sum = dishList.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println("求和 " + sum);
        sum = dishList.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("求和 " + sum);
        System.out.println("---------");
        //通过averagingInt求平均值
        double average = dishList.stream().collect(averagingInt(Dish::getCalories));
        System.out.println("平均值 " + average);
        OptionalDouble average1 = dishList.stream().mapToInt(Dish::getCalories).average();
        System.out.println("平均值 " + average);
        System.out.println("---------");
        //通过summarizingInt同时求总和、平均值、最大值、最小值
        IntSummaryStatistics intSummaryStatistics = dishList.stream().collect(summarizingInt(Dish::getCalories));
         average = intSummaryStatistics.getAverage();  //获取平均值
        int minx = intSummaryStatistics.getMin();  //获取最小值
        int maxx = intSummaryStatistics.getMax();  //获取最大值
        long sumx = intSummaryStatistics.getSum();  //获取总和
        System.out.println("平均值 " + average + "最大 " + maxx + " 最小 " + minx + " 求和 " + sumx);
        System.out.println("---------");
        //返回集合
        List<String> strings = dishList.stream().map(Dish::getName).collect(toList());
        System.out.println("list " + strings);
        Set<String> sets = dishList.stream().map(Dish::getName).collect(toSet());
        System.out.println("set " + sets);
        System.out.println("---------");
        //通过joining拼接流中的元素
        String join = dishList.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println("join " + join);
        System.out.println("---------");
        //通过groupingBy进行分组
        Map<String, List<Dish>> resul = dishList.stream().collect(groupingBy(Dish::getType));
        System.out.println("resul " + resul);
    }
}
