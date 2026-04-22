package dev.azevedo.CadastroDeNinjas.Ninjas;

import dev.azevedo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;


    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    // Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
