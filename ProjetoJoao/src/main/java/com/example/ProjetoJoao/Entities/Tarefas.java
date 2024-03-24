package com.example.ProjetoJoao.Entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;



@Entity
@Table(name ="tb_tarefas")
public class Tarefas {

	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Nome;
	private String Descrição;
	private int DataPrevista;
	private int DataRealizada;
	
	public Tarefas(){}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public int getDataPrevista() {
		return DataPrevista;
	}

	public void setDataPrevista(int dataPrevista) {
		DataPrevista = dataPrevista;
	}

	public int getDataRealizada() {
		return DataRealizada;
	}

	public void setDataRealizada(int dataRealizada) {
		DataRealizada = dataRealizada;
	}

	public Tarefas(Long id, String nome, String descrição, int dataPrevista, int dataRealizada) {
		super();
		Id = id;
		Nome = nome;
		Descrição = descrição;
		DataPrevista = dataPrevista;
		DataRealizada = dataRealizada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DataPrevista, DataRealizada, Descrição, Id, Nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return DataPrevista == other.DataPrevista && DataRealizada == other.DataRealizada
				&& Objects.equals(Descrição, other.Descrição) && Objects.equals(Id, other.Id)
				&& Objects.equals(Nome, other.Nome);
	}
	
	

}
