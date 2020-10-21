package org.example.graphql.model.a

import org.eclipse.microprofile.graphql.Name

sealed class SealedClassA {

    lateinit var propertyA: String

}

@Name("RESPONSE_A")
class Response : SealedClassA {

    lateinit var propertyInResponseA: String

    constructor()

    constructor(propertyA: String, propertyInResponseA: String) {
        this.propertyA = propertyA
        this.propertyInResponseA = propertyInResponseA
    }

}
