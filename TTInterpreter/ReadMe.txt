Pre-requisites




1. Please make sure you have java 6 or higher installed on your machine and present in your PATH variable.


2.  Please make sure Apache-Ant latest version installed on your machine. You can find the installation details here


http://ant.apache.org/manual/install.html 




Deployment




1.  Download the source from either the remote repository : https://github.com/mymichellle/TT.git or the attached zip file.

2. Navigate to the project root directory ‘ TTInterpreter’ and  in your terminal and execute the following command 


ant compile-interpreter 

This should generate the ‘classes’ folder that has all the class files required for the interpreter to run.




3.  Execute the following command 

./TT.sh  <path-to-tt-source-code>


For example, if you have helloworld.tt under the following directory , /home/athresh/Code/helloworld.tt , then  the command will be


./TT.sh /home/athresh/Code/helloworld.tt     




If you receive permission denied error on TT.sh , please enable the execute permission on the TT.sh file. Command for the same will be


.chmod +x  TT.sh