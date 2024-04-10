package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        app.get("/users/{id}/post/{postId}", ctx -> {
            ctx.result("ID: " + ctx.pathParam("id"));
            ctx.result("Post Id: " + ctx.pathParam("postId"));
        });
        app.start(7070);
    }
}
