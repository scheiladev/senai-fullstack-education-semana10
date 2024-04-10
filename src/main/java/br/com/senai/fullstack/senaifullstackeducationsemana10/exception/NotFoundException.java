package br.com.senai.fullstack.senaifullstackeducationsemana10.exception;

public class NotFoundException extends RuntimeException {

  public NotFoundException() {
  }

  public NotFoundException(String message) {
    super(message);
  }
}
