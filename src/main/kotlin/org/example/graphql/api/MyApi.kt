package org.example.graphql.api

import org.eclipse.microprofile.graphql.GraphQLApi
import org.eclipse.microprofile.graphql.Query
import javax.enterprise.context.ApplicationScoped

@GraphQLApi
@ApplicationScoped
class MyApi {

    @Query
    fun a(): org.example.graphql.model.a.Response {
        return org.example.graphql.model.a.Response("propertyA", "innerPropertyA")
    }

    @Query
    fun b(): org.example.graphql.model.b.Response {
        return org.example.graphql.model.b.Response("propertyB", "innerPropertyB")
    }

}
