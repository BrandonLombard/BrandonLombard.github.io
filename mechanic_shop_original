#Establish service types and cost of service.
oil_change = 35
tire_rotation = 19
car_wash = 7
car_wax = 12
choice1_cost = 0
choice2_cost = 0

#Print service costs.
print("Davy's auto shop services")
print(f'Oil change -- ${oil_change}')
print('Tire rotation -- $19')
print('Car wash -- $7')
print('Car wax -- $12\n')

#Input chosen services.
first_service = input('Select first service: \n\n')
second_service = input('Select second service: \n')
print('\n')

# Make input lowercase
first_service = first_service.lower()
second_service = second_service.lower()

#Print first chosen service.
print("Davy's auto shop invoice\n")
if first_service == 'oil change':
    #Problem solving: I originally had trouble combining the parts of the output together, but was able to use + and , to combine parts of the output together. 
    #Problem solving: I had spacing problems when outputting my code, but was able to use the sep= command to avoid this issue.
    choice1_cost = oil_change
elif first_service == 'tire rotation':
    choice1_cost = tire_rotation
elif first_service == 'car wash':
    choice1_cost = car_wash
elif first_service == 'car wax':
    choice1_cost = car_wax
else:
    choice1_cost = 0

if choice1_cost == 0:
  print('Service 1: No service')
else:
  print(f'Service 1: {first_service} | ${choice1_cost}')

#Print second chosen service.
#Using a sep= command so there isn’t any extra unnecessary spacing in my printed output.
if second_service == 'Oil change':
    #Problem solving: I originally had trouble combining the parts of the output together, but was able to use + and , to combine parts of the output together. 
    #Problem solving: I had spacing problems when outputting my code, but was able to use the sep= command to avoid this issue.
    print('Service 2: ', second_service + ", $", oil_change, sep='')
    choice2_cost = oil_change
elif second_service == 'Tire rotation':
    print('Service 2: ', second_service + ", $", tire_rotation, sep='')
    choice2_cost = tire_rotation
elif second_service == 'Car wash':
    print('Service 2: ', second_service + ", $", car_wash, sep='')
    choice2_cost = car_wash
elif second_service == 'Car wax':
    print('Service 2: ', second_service + ", $", car_wax, sep='')
    choice2_cost = car_wax
else:
    print('Service 2: No service')
    choice2_cost = 0
    
#Print total cost.
#Combining both costs with a plus symbol.
print('')
total_cost = choice1_cost + choice2_cost
print('Total: $', total_cost, sep='')
