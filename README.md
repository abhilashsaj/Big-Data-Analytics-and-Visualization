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

### System Specifications 

  * Cloudera 5.13.0-0 qucik start vm or Ubuntu
  * Apache Mahout 0.9

## Clone

` git clone https://github.com/abhilashsaj/Big-Data-Analytics-and-Visualization.git `
