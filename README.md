# javamail test

Build:

```shell
$ ./gradlew shadowJar
```

Run:

```shell
$ java -jar \
  -DSMTP_HOST=smtp.us-ashburn-1.oraclecloud.com \
  -DSMTP_PORT=587 \
  -DSMTP_USER=ocid1.user.oc1..@ocid1.tenancy.oc1...hz.com \
  -DSMTP_PASSWORD=[OCI EMAIL PASSWORD] \
  -DEMAIL_TO=anyone@anywhere.com \
  -DEMAIL_FROM=[OCI APPROVED SENDER] \
build/libs/javamail-all.jar

```
