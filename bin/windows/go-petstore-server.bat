setlocal

set executable=.\modules\openapi-generator-cli\target\openapi-generator-cli.jar

If Not Exist %executable% (
  mvn clean package
)

set SPEC=modules\openapi-generator\src\test\resources\3_0\petstore.yaml
set GENERATOR=go-server
set STUB_DIR=samples\server\petstore\go-api-server

echo Removing files and folders under %STUB_DIR%
del /F /S /Q %STUB_DIR%\go

REM set JAVA_OPTS=%JAVA_OPTS% -Xmx1024M -DloggerPath=conf/log4j.properties
set ags=generate -i %SPEC% -g %GENERATOR% -o %STUB_DIR% --additional-properties packageName=petstoreserver

java %JAVA_OPTS% -jar %executable% %ags%

endlocal
