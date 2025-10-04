package com.hogwai.springbootmultitenancy.config;

public class SchemaContextHolder {

    private static final ThreadLocal<String> CONTEXT = new ThreadLocal<>();

    private SchemaContextHolder() {
    }

    public static void setCurrentSchema(String schema) {
        CONTEXT.set(schema);
    }

    public static String getCurrentSchema() {
        return CONTEXT.get();
    }

    public static void clear() {
        CONTEXT.remove();
    }
}
