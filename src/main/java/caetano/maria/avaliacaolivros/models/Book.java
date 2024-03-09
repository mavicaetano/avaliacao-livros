package caetano.maria.avaliacaolivros.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "BOOKS")
@Getter
@Setter
public class Book {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    private User userId;

    @Column(nullable = false)
    private Integer year;

    @OneToMany(mappedBy = "book")
    private List<Review> reviews;
}
