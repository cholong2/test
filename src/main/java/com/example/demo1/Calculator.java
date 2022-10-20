package com.example.demo1;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
      public String add(int a, int b)
      {return Integer.toString(a+b);}

}
