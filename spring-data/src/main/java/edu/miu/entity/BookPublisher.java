package edu.miu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookPublisher {
    @EmbeddedId
    private BookPublisherId bookPublisherId;

//    @ManyToOne
//    @MapsId("bookId")
//    private Book book;

//    @ManyToOne
//    @MapsId("publisherId")
//    private Publisher publisher;
}
