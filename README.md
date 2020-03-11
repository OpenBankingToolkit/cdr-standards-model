[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

| |Current Status|
|---|---|
|Build|[![Build Status](https://img.shields.io/endpoint.svg?url=https%3A%2F%2Factions-badge.atrox.dev%2Fopenbankingtoolkit%2Fcdr-standards-model%2Fbadge%3Fref%3Dmaster&style=flat)](https://actions-badge.atrox.dev/openbankingtoolkit/cdr-standards-model/goto?ref=master)|
|Code coverage|[![codecov](https://codecov.io/gh/OpenBankingToolKit/cdr-standards-model/branch/master/graph/badge.svg)](https://codecov.io/gh/OpenBankingToolkit/cdr-standards-model)
|Artifactory|[![Bintray](https://img.shields.io/bintray/v/openbanking-toolkit/OpenBankingToolKit/cdr-standards-model.svg)](https://bintray.com/openbanking-toolkit/OpenBankingToolKit/cdr-standards-model)|
|License|![license](https://img.shields.io/github/license/ACRA/acra.svg)|


# Consumer Data Right Standards Model
A Java Consumer Data Right Standards Model, generated from the swagger, to help implementing the Consumer Data Right Standards: https://consumerdatastandardsaustralia.github.io/standards  .
This project is compiled with JDK 11.

## Usage
```
<dependency>
    <groupId>com.forgerock.cdr.standards</groupId>
    <artifactId>cdr-standards-model</artifactId>
</dependency>
```

## Class generation
Many of the classes are generated from Swagger documentation. When a new version of Standards API is released, 
the following steps are performed:
### Install swagger codegen cli
#### On MacOS
1. Install swagger codegen cli using brew
```
brew install swagger-codegen
```
1. Run
```
swagger-codegen generate \
-i {your_json_file or URL} \
-DuseBeanValidation=true -Dmodel --model-package com.forgerock.consumer.data.right.model.{version vx_y_z} \
--group-id com.forgerock.cdr.standards --artifact-id cdr-standards-model -l spring --library spring-boot -o generated
```
#### Other systems
1. Download swagger codegen cli from
>https://swagger.io/tools/swagger-codegen/download
1. Run
```
java -jar swagger-codegen-cli-x.x.x.jar generate \
-i {your_json_file or URL} \
-DuseBeanValidation=true -Dmodel --model-package com.forgerock.consumer.data.right.model.{version vx_y_z} \
--group-id com.forgerock.cdr.standards --artifact-id cdr-standards-model -l spring --library spring-boot -o generated
```
1. Check the generated files and copy them into appropriate source directory. Do not overwrite existing files.
1. Repeat generation for each new swagger json file
1. If using Intelij, run format and optimise imports on newly generated files. 
1. Increment the major or minor version in pom.xml
1. Run build to ensure everything compiles and copyrights are generated for new source files.
1. Commit and raise PR.  

