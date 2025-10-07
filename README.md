Spring dotenvx
========================

# Get started

Add `spring-dotenvx` to pom.xml:

```xml

<dependency>
    <groupId>org.mvnsearch</groupId>
    <artifactId>spring-dotenvx</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

Create a `.env` file with dotenvx-rs or dotenvx JetBrains plugin:

```
# ---
# uuid: 0199bf3e-19c8-7267-b8f4-f36f115553ff
# ---
DOTENV_PUBLIC_KEY=027d44aaaa0188fc32d5a67c60282e32591e153a049af6b7fca02c274b98329dc8

# Environment variables. MAKE SURE to ENCRYPT them before committing to source control
EXAMPLE_NAME=Jackie
```

in `application.properties`, and refer env variables:

```properties
example.name=${EXAMPLE_NAME}
```

# Credits

* spring-dotenv: https://github.com/paulschwarz/spring-dotenv