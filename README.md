Fetch UkrPoshta's package tracking info by package's barcode id (as a fix for @chexov's [ukrposhta.py](https://gist.github.com/chexov/0b5a8f4c7747aad1a864)).

```
lein uberjar
java -jar target/ukrposhta-uber.jar <id>
```

or just
```
java -jar ukrposhta-uber.jar <id>
```
