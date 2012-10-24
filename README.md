# Ant Fit Live

## Overview
Provide live data on the TV while training. 

## Goals
-   Use the data to make it so I can concentrate at one place (the tv) while riding the bike and not staring at my computer.
-   Is the most important thing displaying what I am doing or displaying what I should be doing? The cyclo computer already shows that. It might be more useful to display what I want to do. 
Since I should be retesting my FTP every two weeks or so it would be nice to tell at a glance or be told what wattage I should be putting out. 
An example that came up the other night is an interval indicating FTP-35%. I didn't know what wattage to use. So the simpliest idea is to print a table everytime I update my FTP. 
If I could have an app that would say what the values I should be hitting this would be easy. For example when the interval starts on screen it would display the wattage value for FTP-35%. 
This means I have to go through the workout before hand and get all the timings down and intervals. 

## Steps
-   (DONE) Purchase Ant USB stick 
-   Have live heart being transmitted over the USB showing on the computer.<br>
Unfortunatley streaming data has turned out to be significantly more complicated then originally anticipated so more setup steps are needed to get anything out the door. Additional steps have been added below.
-   [ant](http://www.thisisant.com) has tons of information, but I'm currently lost as to what to do. The first step should be get a beter feel for what is online. 
-   Find all the relevent content and read it
-   Get the ANT Simulator to simulate the HRM
-   Get the ANT Simulator to simulate the Cadence
-   Get the ANT Simulator to simulate the Power Meter
-   Write a simple app or hack an existing to app to be able to parse the live data
-   Figure out JNI so this can be presented to Java nicely. <br><br>

-   Have live wattage shown in a window beside the video.
-   Be able to set FTP so that zones are shown in a meter or similar graphical form
-   Be able to set time and zones so you that they could change during a workout
-   Post ride summary of how successfull I was.
-   Lap comparison?
-   Max numbers shown?
-   Heart Rate / Cadence / Speed / other data shown too?
-   Overlay the output on top of the video?

## Technologies:
### Playing Videos in Java
-   [vlcj](http://capricasoftware.co.uk/corp/index.php)
-   [xuggler](http://www.xuggle.com/xuggler/)

### Video Overlay Examples
-   [sufervision](http://suffervision.appspot.com/)
-   [cyclecam](https://sites.google.com/site/verymadmart/cyclecam)



