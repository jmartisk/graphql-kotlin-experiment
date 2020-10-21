## Run
`mvn quarkus:dev`

## Check the schema
`curl localhost:8080/graphql/schema.graphql`

## Call query a
`curl -X POST -v localhost:8080/graphql -d'{"query":"{a{propertyA propertyInResponseA}}"}'`

## Call query b
`curl -X POST -v localhost:8080/graphql -d'{"query":"{b{propertyB propertyInResponseB}}"}'`