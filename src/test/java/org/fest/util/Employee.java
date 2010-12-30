/*
 * Created on Jun 28, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.util;

/**
 * class used for testing Introspection 
 *
 * @author Joel Costigliola 
 *
 */
public class Employee {

  // field public getter => valid property
  private int age;

  public int getAge() {
    return age;
  }

  // fields without public getter => not a property
  private String company = "google";
  private boolean firstJob;

  String getCompany() {
    return company;
  }

  boolean isFirstJob() {
    return firstJob;
  }
  
  // field without getter => not a property
  @SuppressWarnings("unused")
  private double salary;

  // field without getter => not a property

  public Employee(double salary, int age) {
    super();
    this.salary = salary;
    this.age = age;
  }
  
}

