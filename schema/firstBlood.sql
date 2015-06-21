CREATE TABLE `user` (
	`userId` int(11) NOT NULL AUTO_INCREMENT,
	`openId` int(11) NOT NULL COMMENT '微信的openid',
	`phone` varchar(32) NOT NULL DEFAULT '' COMMENT '手机号',
	`isPhoneCheck` tinyint(4) NOT NULL DEFAULT -1 COMMENT '手机号是否通过验证 目前不验证 -1 wei yan zheng',
	`salt` varchar(128) NOT NULL DEFAULT '#cocMaster666' COMMENT 'salt目前写死 原谅这么蠢 #cocMaster666',
	`passwd` varchar(128) NOT NULL DEFAULT '' COMMENT '加盐MD5后的密码',
	`userStatus` tinyint(4) NOT NULL DEFAULT 0 COMMENT '用户种类	这里是指在部落中的(长老1.首领3 副手2 others 0...)',
	`clanId` int(11) NOT NULL DEFAULT -1 COMMENT '所在部落id	如果是未加入任何部落的user 默认这里是 -1',
	`strongHoldLevel` tinyint(4) NOT NULL DEFAULT -1 COMMENT 'stronghold 等级 大本营 DEFAULT -1', 
	`leagueLevel` int(11) NOT NULL DEFAULT 0 COMMENT '游戏中奖杯数',
	`troops` varchar(256) COMMENT 'troops 兵种信息 TroopsMap序列化成String放在这里 感觉会比专门开一个troops表好一点',
	`createTime` datetime NOT NULL,
    `updateTime` datetime NOT NULL,
	PRIMARY KEY(`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `clan` (
	`clanId` int(11) NOT NULL AUTO_INCREMENT,
	`clanTag` varchar(64) NOT NULL DEFAULT '' COMMENT 'coc官方的唯一标识',
	`clanType` tinyint(4) NOT NULL DEFAULT 0 COMMENT '部落的状态 未知0 需要申请1 关闭2 任何人可入3',
	`warFrequency` tinyint(4) NOT NULL DEFAULT 0 COMMENT '部落站频率 未知0 ALWAYS1 NEVER2 2/WEEK 2 1/WEEK 3 RARELY 4',
	`membersCount` int(11) NOT NULL DEFAULT 0 COMMENT '部落的人数',
	`totalPoints` int(11) NOT NULL DEFAULT 0 COMMENT '部落奖杯',
	`warsWon` int(11) NOT NULL DEFAULT 0 COMMENT '部落站胜利次数',
	`requiredTrophies` int(11) NOT NULL DEFAULT 0 COMMENT '部落站加入门槛奖杯数',
	`location` int(11) NOT NULL DEFAULT 0 COMMENT '部落所在位置 0CHINA 1 OTHERS',
	PRIMARY KEY(`clanId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
