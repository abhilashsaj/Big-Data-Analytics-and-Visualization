# Big Data Analytics and Visualization

# Apache Mahout

## Compilation and Execution 

`$ javac -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." RecommenderIntro.java `

`$ java -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." RecommenderIntro `

## Apache Mahout

### Item Recommender Engine

For compilation and execution

`$ javac -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." Recommender.java `

`$ java -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." Recommender`

### Direct Install

* Download tar gz file [here](https://downloads.apache.org/mahout/0.13.0/apache-mahout-distribution-0.13.0.tar.gz).
* Extract it using command 
  `$ sudo tar -zxvf apache-mahout-distribution-0.13.0.tar.gz`
* Move unzip folder into /usr/lib directory 
  `$ sudo mv apache-mahout-distribution-0.13.0 /usr/lib/mahout`
* Edit bashrc file 
  `$ sudo gedit ~/.bashrc`
* Add following line into it : 
  `export MAHOUT_HOME=/usr/local/mahout`
* Run this command 
  `source ~/.bashrc`
  

Your Apache Mahout is installed successfully.

### Installation through Maven 
* Install Maven `$ sudo apt-get install maven`
* Check it installed or not `$ mvn -version`
* Download {src ZIP} file of Mahout from the [link](http://ftp.wayne.edu/apache/mahout/)
* Unzip the Mahout File `$ unzip -a  apache-mahout-distribution-0.13.0-src.zip`
* Move unzip folder into /usr/local directory `$ sudo mv apache-mahout-distribution-0.13.0-src /usr/local/mahout `
* Go to mahout directory in terminal `cd /usr/local/mahout/`
* Then Run following command `"mvn install"`

This will take around 30 minutes because it takes time to test all the algorithms.


### Requirements

  * Java
  * Ubuntu 18.04
  * Apache Mahout 0.13.0 (preferred)


## Clone

`git clone https://github.com/abhilashsaj/Big-Data-Analytics-and-Visualization.git `
