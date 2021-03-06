# Big Data Analytics and Visualization

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
  * Ubuntu
  * Apache Mahout 0.13.0

<br/>

## Apache Hue

### Cloudera

Access the Hue demo provided by Cloudera from the the URL https://demo.gethue.com/

* Create a database in the Hue warehouse and execute any five DDL and DML commands in it. 

* Observe the operations happening in the MapReduce Engine and HDFS after the execution of each command. 

* After each step, take the screenshot and include it in a document file with proper description of it as per your obesrvation. 

* Finally convert that doc file to pdf format and upload it here. 

## AWS Quicksight

Steps
  * Create an AWS account using Educate(no credit card) or Standard mode
  * Visit quicksight through console and create an account
  * [Blog](https://aws.amazon.com/blogs/big-data/10-visualizations-to-try-in-amazon-quicksight-with-sample-data/)  Go to the third section (Visualizations for a data scientist) in the  AWS Big Data Blog. Here you can see two visualizations based on the temperature readings from the road weather information stations deployed at different location in US cities. The station has two sensors where the first one measures the temperature of street surface and second one measures the ambient air temperature at the station each second. 
    * Visualize the max air temperature of any one city from different RWI station sensors given in the dataset. Download and              use the .csv file as the dataset from the “Download and resources” link (https://bit.ly/2zyvqJR)
    * Visualize the minimum temperature of the road surface at different times as shown in the second graph with station                      names at the right hand side. This visual can predict the road conditions at different locations during a particular time of              the year.
    
      1.
          * Start New Analysis
          * Upload dataset
          * Create Vertical Bar Graph (Max of Airtemperature by Datetime and Stationname)
          * Datetime on x-axis, Airtemp(max) values and StationNames as color  (apply filter - optional)
      
      2.
          * Create Line Chart with DateTime on x axis, Temp(min) as values, StationNames as color (apply filter - optional)
    * After creating both the visuals, go to the “Share” button on the top right hand side of your QuickSight page and click on “Publish dashboard” and give a name to your new dashboard. This option will publish your newly created dashboard with two visuals so that others can be invited to view or edit it. Also the dashboard can be embedded in a web/mobile application once it is published.

    * Go to the “Accounts” button at the extreme right hand side of the QuikSight window which displays your unique QS account number (eg. 914988550782) and choose the option “Manage QuickSight”. Under the Manage Users option click on “Invite users” button and enter the email-id binupk78@gmail.com and invite me as “AUTHOR” to view and evaluate your dashboard!!

<hr/>

## Apache Flume and Twitter Sentiment Analysis

Presentation added

## Clone

`git clone https://github.com/abhilashsaj/Big-Data-Analytics-and-Visualization.git `
