Workflow is testing token-propagation: start dumbServer.py, it will dump the header and content of the request, this way we can ensure the authorization header is propagated to the service without anything set in the properties, onlyu the token-propagation enabled.

When running `mvn quarkus:dev`, a keycloak will be started: the port in the properties must be updated with the port used by keycloak, auto-reload will reload the workflow to apply the changes.


The test if the token is propgated, we first need to generate a token against the OIDC provider (keycloak) then use the token in the execution request:
```console
KEYCLOAK_PORT=32802
ACCESS_TOKEN=`curl -X POST http://localhost:${KEYCLOAK_PORT}/realms/quarkus/protocol/openid-connect/token \
curl -XPOST http://localhost:8080/basic -H "Content-Type: application/json" -H "Authorization: bearer ${ACCESS_TOKEN}" -d '{"workflowdata": {"projectName": "test"}}' -v
```