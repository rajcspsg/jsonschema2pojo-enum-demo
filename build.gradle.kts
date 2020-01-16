group = "org.example"
version = "1.0-SNAPSHOT"

buildscript {
  repositories {
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61")
    classpath ("org.jsonschema2pojo:jsonschema2pojo-gradle-plugin:1.0.1")
  }
}

apply(plugin = "java")
apply (plugin = "jsonschema2pojo")


//jsonSchema2Pojo {
//  source = files("${sourceSets.main.output.resourcesDir}/json")
//}


