package com.dongqilin.entity;

public class Permissions {
    private Long id;

    private String permission;

    private String description;

    private Boolean available;

    private Permissions(Builder builder) {
        setId(builder.id);
        setPermission(builder.permission);
        setDescription(builder.description);
        setAvailable(builder.available);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public static final class Builder {
        private Long id;
        private String permission;
        private String description;
        private Boolean available;

        public Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder permission(String val) {
            permission = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder available(Boolean val) {
            available = val;
            return this;
        }

        public Permissions build() {
            return new Permissions(this);
        }
    }
}