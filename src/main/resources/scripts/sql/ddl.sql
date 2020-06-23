USE bus;

CREATE TABLE `bus` (
  `id` int(20) NOT NULL,
  `bus_name` varchar(255) NOT NULL,
  `bus_type` varchar(10) DEFAULT NULL,
  `active` char(1) DEFAULT 'Y',
  `created_at` datetime DEFAULT now(),
  `modified_at` datetime DEFAULT now(),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


CREATE TABLE `route` (
  `id` int(20) NOT NULL,
  `route_name` varchar(255) NOT NULL,
  `route_description` varchar(255) DEFAULT NULL,
  `active` char(1) DEFAULT 'Y',
  `created_at` datetime DEFAULT now(),
  `modified_at` datetime DEFAULT now(),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;