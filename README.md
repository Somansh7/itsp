# BCB
# AUTONOMOUS SOLAR GRASS CUTTER
## Abstract
##### Our perception is to make an autonomous solar powered grass cutter that would mow an entire field automatically creating desired pattern out of grass by varying its heihht. We also aim to develop an android application enabling user to send the dimensions of field and grass and also the desired pattern to the grass cutter. The solar panel can also be easiy used for other devices.
## 1.Introducton
### 1.1 Motivation
##### Using a grass cutting machine which is not automatic is somewhat a waste of human labour and time especially in an era where most of our appliances and devices are automatic. The existing big and heavy lawn mowers are too difficult and cumbersome to use so we wanted an easy solution which everyone from children to aged people would find much easier to use. we even wanted to take it a step further so that the user could make desired design on ground with the help of just their finger tip. to make our project even more appropriate for today's world whose energy needs are inreasing steeply, we made it solar powered.
### 1.2 designing the grass
##### we had two things to be decided regarding the method to make the pattern on ground.
1. The freedom to be given to the user for designing
  * Specific set of precoded designs.
  * english letters that could be placed on field with code for each letter preloaded.
  * giving complete freedom to user to make any design.
2. How to move over the lawn while trimming the grass
  * to divide the field in smaller rectangles of various szes depending on the height of grass needed and trim each part one by one.
  * to move over the lawn along the length in a zig zag manner irrespective of design while changing the height of blade whenever required
#### 1.2.1 Freedom of design
##### As we learned more about image processing and arduino coding we realised that giving ttal freedom and writing a general code in arduino was not that difficult as we could produce an 

### 1.3 Android app 
#### Idea-
* First page takes dimensions of field on which pattern is to be drawn,then this is stored in a integer variable.
* Second page contains drawing code as the user touches the screen , the position  where the user touches is stored in an array which will be used for pixelation afterwards.
* We pixelate this drawing image by enlarging the pixel accordingly ,as one pixel on the screen corresponds to the minimum grass cut by the blade i.e. a circle with diameter 30 cm.  
* We pass this processed array (i.e. after pixelation) to arduino which maps it to corresponding pixels on the ground. For this we plan to use bluetooth module HC-05.
#### Refrence-
1. https://www.raywenderlich.com/120177/beginning-android-development-tutorial-installing-android-studio
2. https://developer.android.com/training/basics/firstapp/starting-activity.html#BuildIntent
3. https://www.tutorialspoint.com/android/android_image_effects.htm
#### Problems faced-
While using android app even if app is compiled correctly it didn't work then open logcat and searchfor fatal exception on google and try out the solution.
For running the app on android phone we need to switch on the developer mode.

