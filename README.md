 <h2>1. Introducing UISteps-serenity</h2>
UISteps-serenity designed for easy start and more comfortable using of test framework <a href="http://www.thucydides.info/docs/serenity/">Serenity BDD</a>
<h2>2. Building UISteps in maven</h2>
<h4>2.1 Using serenity maven archetype</h4>
Create maven projet from serenity-junit-archetype or serenity-jbehave-archetype.<br>
Then add to project pom.xml 
to the end of section repositories: 
<pre>
<plaintext>
	<repository>
	  	<snapshots>
	        <enabled>false</enabled>
	    </snapshots>
	    <id>central</id>
	    <name>bintray</name>
	    <url>http://jcenter.bintray.com</url>
	</repository>
</plaintext>
</pre>
and to the end of section depencies:
<code data-lang="xml">
	<dependency>
        <groupId>com.qantium</groupId>
        <artifactId>uisteps-serenity</artifactId>
        <version>1.5</version>
    </dependency>
</code>
