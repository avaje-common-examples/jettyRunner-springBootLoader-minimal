package main;

import org.avaje.jettyrunner.JettyRun;

public class RunWebapp {

  public static void main(String[] args) {

    JettyRun jettyRun = new JettyRun();
    jettyRun.runServer();
  }
}
