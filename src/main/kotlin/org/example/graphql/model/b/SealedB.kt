package org.example.graphql.model.b

import org.eclipse.microprofile.graphql.Name

sealed class SealedClassB {

    lateinit var propertyB: String

}

@Name("RESPONSE_B")
class Response : SealedClassB {

    lateinit var propertyInResponseB: String

    constructor()

    constructor(propertyB: String, propertyInResponseB: String) {
        this.propertyB = propertyB
        this.propertyInResponseB = propertyInResponseB
    }

}
