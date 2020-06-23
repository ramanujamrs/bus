#route
INSERT INTO route(route_name,route_description,active) VALUES('DFW-HSB','DFW to Harrisburgh','y');
INSERT INTO route(route_name,route_description,active) VALUES('DFW-MEM','DFW to Memphis','y');
INSERT INTO route(route_name,route_description,active) VALUES('DFW-HOU','DFW to Houston','y');

#bus
INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Super Fast","Express Service - 50 Seater",'y',1);
INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Comfy One","Business Class - 30 Seater",'y',1);

INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Economy","Ordinary Fare - 85 Seater",'y',2);

INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Super Fast","Express Service - 50 Seater",'y',3);
INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Comfy One","Business Class - 30 Seater",'y',3);
INSERT INTO bus (bus_name,bus_type,active,route_id) VALUES ("Economy","Ordinary Fare - 85 Seater",'y',3);
