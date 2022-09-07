package poo.ex_robo;

import poo.ex_ponto.Ponto;

public static class Robo {
  static Ponto position;
  char direction;

  public static void main(String[] args) {
    System.out.println(position);
  }

  public Robo(double _x, double _y) {
    Robo.position = new Ponto(_x, _y);
  }

  public void move(char dir, int qtoMove) {

  }

  public void top(int pos) {
    this.pos = pos + direction;
  }

  public void down(int pos) {
    this.pos = pos + direction;
  }
    
  public void left(int pos) {
    this.pos = pos + direction;
  }

  public void right(int pos) {
    this.pos = pos + direction;
  }
}
