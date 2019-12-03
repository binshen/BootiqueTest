package com.bootique;

import com.bootique.api.HelloResource;
import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;

public class Application {

    public static void main(String[] args) {

        Module module = binder -> JerseyModule.extend(binder).addResource(HelloResource.class);

        Bootique
                .app(args)
                .module(module)
                .autoLoadModules()
                .exec()
                .exit();
    }
}
