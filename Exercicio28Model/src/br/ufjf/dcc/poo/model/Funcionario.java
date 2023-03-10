package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	
	private int matricula;
	private Departamento departamento;
	private ArrayList<Atendimento> atendimentos;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public ArrayList<Atendimento> getAtendimento() {
		return atendimentos;
	}
	public void setAtendimento(ArrayList<Atendimento> atendimento) {
		this.atendimentos = atendimento;
	}
	
}
