package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;
}
