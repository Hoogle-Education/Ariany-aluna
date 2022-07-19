package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import entities.interfaces.AumentoAnual;

public class Funcionario implements AumentoAnual {

  private String name;
  private int age;
  private BigDecimal salary;

  // OneToOne
  private Adress adress;

  // OneToMany
  private List<Task> tasks;

  public Funcionario() {
    tasks = new ArrayList<>();
  }

  public Funcionario(String name, int age, BigDecimal salary, Adress adress) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.adress = adress;
    tasks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public Adress getAdress() {
    return adress;
  }

  public void setAdress(Adress adress) {
    this.adress = adress;
  }

  public List<Task> getJobs() {
    return tasks;
  }

  public void assignTask(Task task) throws Exception {

    if (tasks.size() > 5)
      throw new Exception("A pessoa esta sobrecarregada!");

    tasks.add(task);
  }

  public void removeTask(int index) {
    tasks.remove(index);
  }

  public void removeTask(Task task) {

    if (!tasks.contains(task))
      throw new NoSuchElementException("A tarefa não existe");

    tasks.remove(task);
  }

  public void transferTask(Task task, Funcionario destionation) throws Exception {
    removeTask(task);
    destionation.assignTask(task);
  }

  @Override
  public void calculaAumento() {
    if(salary.compareTo(new BigDecimal("10000.0")) < 0) {
      salary = salary.multiply(new BigDecimal("1.05"));
    }
  }

}
