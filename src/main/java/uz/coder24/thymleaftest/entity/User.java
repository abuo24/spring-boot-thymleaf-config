package uz.coder24.thymleaftest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name", length = 50)
    private String fullName;
    @Column(name = "email", unique = true, nullable = false, updatable = false)
    private String email;
    @Column(name = "is_male", columnDefinition = "boolean default true")
    private Boolean isMale;
    @CreationTimestamp
    @Column(nullable = false)
    private Date createdAt;
    @UpdateTimestamp
    @Column(nullable = false)
    private Date updatedAt;
}
