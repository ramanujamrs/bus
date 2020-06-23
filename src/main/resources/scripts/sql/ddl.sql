USE bus;

CREATE TABLE `route` (
                         `id` int(20) NOT NULL AUTO_INCREMENT,
                         `route_name` varchar(255) NOT NULL,
                         `route_description` varchar(255) DEFAULT NULL,
                         `active` char(1) DEFAULT 'Y',
                         `created_at` datetime DEFAULT now(),
                         `modified_at` datetime DEFAULT now(),
                         PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE `bus` (
                       `id` int(20) NOT NULL AUTO_INCREMENT,
                       `bus_name` varchar(25) NOT NULL,
                       `bus_type` varchar(255) DEFAULT NULL,
                       `active` char(1) DEFAULT 'Y',
                       `route_id` int(20),
                       `created_at` datetime DEFAULT now(),
                       `modified_at` datetime DEFAULT now(),
                       PRIMARY KEY (`id`),
                       FOREIGN KEY (route_id)
                           REFERENCES parent(id)
                           ON DELETE CASCADE
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


