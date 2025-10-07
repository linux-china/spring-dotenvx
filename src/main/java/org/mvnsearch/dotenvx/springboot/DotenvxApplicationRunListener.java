package org.mvnsearch.dotenvx.springboot;

import org.mvnsearch.dotenvx.DotenvPropertySource;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class DotenvxApplicationRunListener implements SpringApplicationRunListener {

  @SuppressWarnings("unused")
  public DotenvxApplicationRunListener(SpringApplication application, String[] args) {
    // unused
  }

  /**
   * Add the {@link DotenvPropertySource} to the application's environment.
   *
   * @param bootstrapContext the bootstrap context
   * @param environment the environment
   */
  @Override
  public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
    DotenvPropertySource.addToEnvironment(environment);
    SpringApplicationRunListener.super.environmentPrepared(bootstrapContext, environment);
  }
}
