package org.example.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

  private static final Logger logger = LoggerFactory.getLogger(MyServlet.class);

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    logger.info("doGet - hello");

    PrintWriter writer = resp.getWriter();
    writer.append("Hello world, from servlet");
    writer.flush();

  }
}
