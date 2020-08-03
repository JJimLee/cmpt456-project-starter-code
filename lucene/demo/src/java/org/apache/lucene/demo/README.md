# Apache_Lucene_Modify

## Note

This project is some modification towards Lucene library in Java. Due to the concern about the size of Lucene library, this repository only includes the modification files. The codebase can be forked from https://github.com/apache/lucene-solr.

## Environment

	1. Install Java 8
	2. Clone Lucene from https://github.com/apache/lucene-solr
	3. Replace the original "demo" folder with the "demo" folder in my repository
	4. Install Docker

## Instructions to Run

	1. docker build -t cmpt456-lucene-solr:6.6.7 .
		or		docker run -t -d --name "testing_file" [tag id]
	2. docker run -it cmpt456-lucene-solr:6.6.7
	 	or		docker exec -it testing_file /bin/bash
	 	use to check ls /lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	3. ant -f lucene/demo/build.xml
	4. ant -f lucene/demo/build.xml -Ddocs=lucene/demo/data/wiki-small/en/articles/ run-indexing-demo
	5. ant -f lucene/demo/build.xml run-search-index-demo


## Copy insturction
	
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/HtmlIndexFiles.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/CMPT456Analyzer.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/CMPT456Similarity.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/TFIDFHtmlIndexFiles.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/TFIDFSearchFiles.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/SimpleMetrics.java testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/src/java/org/apache/lucene/demo/stopwords.txt testing_file:/lucene-solr/lucene/demo/src/java/org/apache/lucene/demo/
	docker cp ./cmpt456-project1-starter-code/lucene/demo/build.xml testing_file:/lucene-solr/lucene/demo/
	ant -f lucene/core/build.xml; ant -f lucene/demo/build.xml

	remove stop words
	docker exec testing_file rm -rf stopwords.txt

## Manuel testing

	Stop word note
	The stop words instruction is manuelly build in CMPT456Analyzer.java, if there happen with readin txt file. there was a supporting list with array stopWords1 please at line 83 and can sweth with the line 86 that with new CharArraySet(stopWords1, false)