package com.kotlinspring.entity

import javax.persistence.*

@Entity
@Table(name = "INSTRUCTORS")
data class Instructor(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,
    var name: String,
    @OneToMany(
        mappedBy = "instructor",
        cascade = [CascadeType.ALL],
        orphanRemoval = true
    )
    var courses : List<Course> = mutableListOf()

) {
    override fun toString(): String {
        return "Instructor(id=$id, name='$name', courses=$courses)"
    }
}