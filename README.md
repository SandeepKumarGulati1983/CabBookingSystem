# CabBookingSystem
OLA/UBER type cab booking system 

#My thought 
as per my understanding we can achieve this by creating two objects   , one is 
User  and one is Cab 

Where in user , we have lat/ long  and other user specific details of user mobile or specified by user and in cab obejct we have status , shared status , lat long and other cab related details 

cab objects will be maintained in the DB for fast processing and we can make a registered user obejcts DB also .


now when user request a booking , then we can send the lat/long of user to server and compare with sorted cab DB and find out the nearest cab as per lat/long comparison  and Geofencing .

we can send an array of nearest cab to mobile to plot the same over the map 

one of them will be most nearest one and his reachable time we can show to user by calculating with the mathmatical calculation w.r.t the speed of his area.

on confirmation , we can change the status of cab , so that it will not appear in search of another user or change appropriately  to serve the purpose of shared cab only .

# Reference to understand the lat long / Geofencing and other stuff 

distance calculation formula - https://www.movable-type.co.uk/scripts/latlong.html 
