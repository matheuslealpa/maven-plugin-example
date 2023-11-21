package com.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello-world")
public class HelloWorldMojo extends AbstractMojo {

    @Parameter(property = "greeting", defaultValue = "Hello, World!")
    private String greeting;

    public void execute() throws MojoExecutionException {
        getLog().info(greeting);
    }
}
