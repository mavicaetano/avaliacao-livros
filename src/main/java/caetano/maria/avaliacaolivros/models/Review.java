package caetano.maria.avaliacaolivros.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "REVIEWS")
@Getter
@Setter
public class Review {

    @Id
    private Integer id;

    @Column(nullable = false, columnDefinition = "INTEGER CHECK (rate >= 1 AND rate <= 5)")
    private Integer rate;

    @ManyToOne
    private User name;

    @ManyToOne
    private Book title;

}
