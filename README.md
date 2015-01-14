# GoogleAppEngine-JDO-Mavenize

I had many trouble when tried mavenize GAE with JDO.
This project is backup and GAE-Maven sample.


### build and run

```bash
$ mvn clean compile appengine:enhance package appengine:devserver
```


### Tips

* check org.datanucleus versions 
** check url https://code.google.com/p/datanucleus-appengine/wiki/Compatibility
** same version IDE plugin uses if you use Intellij IDEA ( or eclipse? )
*** and if you use Run from Intellij IDEA.

