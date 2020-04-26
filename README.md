# Big Data Analytics and Visualization

## Apache Mahout

### Recommender Example

For compilation and execution

`$ javac -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." Recommender.java `

`$ java -cp "/usr/lib/mahout/*:/usr/lib/mahout/lib/*:." Recommender`

### Direct Install

* Download tar gz file.
* Extract it using command 
  `$ sudo tar -zxvf mahout-distribution-x.x.tar.gz `
* Move unzip folder into /usr/lib directory 
  `$ sudo mv mahout-distribution-x.x /usr/lib/mahout`
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
* Download {src ZIP} file of Mahout from the link http://ftp.wayne.edu/apache/mahout/
* Unzip the Mahout File `$ unzip -a mahout-distribution-x.x-src.zip`
* Move unzip folder into /usr/local directory `$ sudo mv mahout-distribution-x.x /usr/local/mahout `
* Go to mahout directory in terminal `cd /usr/local/mahout/`
* Then Run following command `"mvn install"`

This will take around 30 minutes because it takes time to test all the algorithms.


### System Specifications 

  * Cloudera 5.13.0-0 qucik start vm or Ubuntu
  * Apache Mahout 

## Clone

` git clone https://github.com/abhilashsaj/Big-Data-Analytics-and-Visualization.git `
