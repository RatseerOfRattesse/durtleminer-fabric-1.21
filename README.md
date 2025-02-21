# Durtleminer
Durtleminer is a Minecraft mod made for Fabric and for use on the Durtle Empire SMP server. It contains various ideas requested by the SMP community, with no particular theme.
## Changelogs
### 1.00
- Added Lesser Firmament Pickaxe
  - Obtain by combining a Lesser Firmament Amalgam, Lesser Firmament Template, and Netherite Pickaxe in a smithing table.
  - Can instamine most pickaxe-mineable blocks
  - Has a cool tooltip that shows function on pressing shift
  - Can accept all pickaxe-acceptable enchantments
- Added Lesser Firmament Amalgam
  - Obtain from smelting Lesser Firmament Template **[or from End City loot] <REMOVED FEATURE**
- Added Lesser Firmament Template
  - Obtain from **[from End City loot] <REMOVED FEATURE**

### 1.01 - 1.04
- idk what happened here the next version I ever released was just arbitrarily labelled 1.5 so I'm just gonna leave these blank so I don't have to rename a bunch of stuff

### 1.05
- Made feather falling exclusive to End Cities
- Made mending exclusive to Ancient Cities

### 1.06
- Made Lesser Firmament Pickaxes fire resistant

### 1.07
- Evokers now drop trial keys

### 1.08
- Replaced the elytra item frame in End Ships with an Ominous Vault containing an elytra and some other end items. It requires a Mysterious Key of the End variant to open.
- Added Mysterious Key - end variant. Currently unobtainable. Future plan is to have more variants for more vaults containing useful items across the world.

### 1.09
- Added Dark Purpur blockset

### 1.10
- Changed most recipes and models over to the new datagen system
- Added chorus woodset (except for signs, boats, and chestboats) and recipe support
- Added recipes for Dark Purpur, including stonecutter recipes. A Dark Purpur block can be obtained by putting two popped chorus fruit diagonally and two black dye/ink sacs also diagonally in a square formation

### 1.11
- Added Ender Trial Key and Ominous Ender Trial Key for an upcoming end-themed trial chamber
- Added loot tables for Trial Spawners and Vaults in the same structure
- Command for normal vaults in the structure
/give @s minecraft:vault[block_entity_data={id:"minecraft:vault",config:{loot_table:"durtleminer:vaults/end_ports/normal/end_port",key_item:{id:"durtleminer:ender_trial_key"}},}]
- Command for ominous vaults in the structure
/give @s minecraft:vault[block_state={ominous:"true"},block_entity_data={id:"minecraft:vault",config:{loot_table:"durtleminer:vaults/end_ports/ominous/end_port_ominous",key_item:{id:"durtleminer:ominous_ender_trial_key"}},}]
- Following commands require a command block
- Command for shulker trial spawners in the structure
/give @p trial_spawner[block_entity_data={id:"minecraft:trial_spawner",spawn_data:{entity:{id:"minecraft:shulker"}},normal_config:{total_mobs:6,simultaneous_mobs:2,simultaneous_mobs_added_per_player:0.5,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:shulker"}},"weight":1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/normal/end_port",weight:1}]},ominous_config:{total_mobs:6,simultaneous_mobs:3,simultaneous_mobs_added_per_player:1,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:shulker"}},weight:1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/ominous/end_port_ominous",weight:1}]},}]
- Command for phantom trial spawners in the structure
/give @p trial_spawner[block_entity_data={id:"minecraft:trial_spawner",spawn_data:{entity:{id:"minecraft:phantom",Color:10b}},normal_config:{total_mobs:6,simultaneous_mobs:2,simultaneous_mobs_added_per_player:0.5,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:phantom"}},"weight":1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/normal/end_port",weight:1}]},ominous_config:{total_mobs:6,simultaneous_mobs:3,simultaneous_mobs_added_per_player:1,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:phantom"}},weight:1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/ominous/end_port_ominous",weight:1}]},}]
- Command for endermite trial spawners in the structure
/give @p trial_spawner[block_entity_data={id:"minecraft:trial_spawner",spawn_data:{entity:{id:"minecraft:endermite",Color:10b}},normal_config:{total_mobs:12,simultaneous_mobs:4,simultaneous_mobs_added_per_player:0.5,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:endermite"}},"weight":1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/normal/end_port",weight:1}]},ominous_config:{total_mobs:18,simultaneous_mobs:6,simultaneous_mobs_added_per_player:1,ticks_between_spawn:20,spawn_potentials:[{data:{entity:{id:"minecraft:endermite"}},weight:1}],loot_tables_to_eject:[{data:"durtleminer:trial_spawners/end_ports/ominous/end_port_ominous",weight:1}]},}]

### 1.12
- Added daggers from wood to netherite. All daggers have two less damage than their respective sword and no attack cooldown. Crafted by putting the material above a stick.
- Changed Dark Purpur textures (made by Jarnu47)

### 1.13
- Added the paintings 'Durtle Realistic,' 'Durtle Cartoon,' 'Durtle Sunset', and 'Campfire Cuddles.'
- Added the music disc 'Hez Happy Music.' Unfortunately, I could not figure out how to link the sound to the item and had to make it using data. It's only obtainable through recipes or this command:
/give @s durtleminer:music_disc_hez_happy_music[minecraft:jukebox_playable={song:"durtleminer:hez_happy_music"}]
- Attempted adding a custom goat horn but couldn't figure it out, so instead added a sound to the resources. The horn can be obtained using this command:
/give @a goat_horn[instrument={range:100,use_duration:100,description:"Arjun is Sus",sound_event:{sound_id:"durtleminer:item.goat_horn.arjun_is_sus_goat_horn"}},lore=['["",{"text":"Arjun is Sus","italic":false,"color":"gray"}]']]
- Added in the End Grave structure. It's a small building spawning in the outer end, with a double chest of End City loot. Built by oelthelion.

### 1.14
- Added in recipes for invisible item and glow item frames. Can be crafted by placing the respective frame with a block of glass. Unfortunately they don't retain invisibility after being placed and broken.

### 1.15
- Added seven new armour trims based on Ardoni markings from Songs of War (If you don't know what that is, SHAME ON YOU)
  - Foresight (Based on Hubris Nestoris). Found in buried treasure chests, duplicated with Hearts of the Sea
  - Confluence (Based on Ingressus Voltaris). Found in End cities, duplicated with Purpur blocks
  - Unity (Based on Achillean Nestoris). Found in Trial Chambers, duplicated with Breeze Rods
  - Extremism (Based on Tygren Voltaris). Found in Stronghold libraries, duplicated with End Stone
  - Rebellion (Based on Senn Voltaris). Found in Igloos, duplicated with blue ice
  - Naivety (Based on Ria Sendaris). Found in plains villages, duplicated with slime balls
  - Internecion (Thalleous Sendaris). Found in ancient cities, duplicated with cobbled Deepslate
- Added underground room structures. Built by Suuuuuuuuuuuune.
  - They spawn a single block of either cherry fence, magma block, or stripped birch wood
  - Dig straight down underneath one of these to find either a diamond deposit or a structure with chest loot surrounded by a diamond deposit.

### 1.16
- Added Mr. Finch's hoe (From Songs of War)
  - Bonemeals crops and trees only, does not consume durability, tills normally
  - Found in Mr. Finch's farm
- Added Mr. Finch's farm structure, spawns in dark oak forests, contains a few chests worth of woodland mansion loot
  - About as rare as a woodland mansion
  - Contains an ominous vault containing Mr. Finch's hoe
  - Vault can be opened with a Mysterious Key, farm variant
Added Mysterious Key, farm variant
  - Found in ominous vaults in Trial Chambers

### 1.17
- Added the Tombs of the Builder Structure, Built by oelthelion
  - Spawns undergound in any biome a Trial Chamber spawns in
  - Spawns a central room ('ruins of battle') in which there is a trial spawner and a chest full of mineral loot (entire blocks of it)
  - All other structures branch off of it
  - Blacksmith room: village blacksmith loot, but all the ingots are blocks and there's a special axe on the ground
  - Colosseum room: a massive room with two levels. The lower level is full of posed armour stands, set in battle. The walls are surrounded by a bunch of ominous vaults containing lots of rare loot (including wither skulls, heavy cores, and totems) The top level is empty, but lined with trial spawners. Don't fight them on normal mode - they'll just drop regular trial keys and nothing else. Fight them on ominous however, and you'll get ominous keys, plus some stupid challenging mobs (you will die in iron and likely diamond).
  - Elbow hallway: just a small hallway. There's soom special iron gear on the ground, plus some blacksmith loot. And a trial spawner!
  - Home-like room: a bed and a barrel full of food
  - Icy hallway: a trial spawner. No loot
  - Maze room: a big maze with multiple trial spawners and some nice mineral loot
  - Overgrown room: literally just decoration. Absolutely nothing of value
  - Staircase of doom: big parkour staircase. Might have more rooms at the top, might not
  - Wooden hallway: a trial spawner and barrels full of logs and occasionally god apples
  - Tombs are about as rare as the maximum rarity of a village. They're kinda overpowered, but most of the good loot is in vaults so you most likely only need to find one for a whole server
### 1.18
- Changed up netherite gear
  - Upgrading diamond to netherite produces shattered gear
  - Shattered gear has to be put in a smithing table with a netherite upgrade template and a nether star to turn into netherite gear.
  - As this mod is primarily for the SMP, this was made to stop a _certain player_ from getting everything on the first day.
### 1.19
- Fixed Arjun is Sus goat horn and Hez Happy Music disc. Both now work regardless of commands or recipes.
- Added I Am Steve goat horn (exactly what it sounds like).
- Changed lang files over to the datagen system.
### 1.20
- Made diamonds and netherite renewable
  - Diamond gear can be smelted down into one diamond
  - Trade one netherite upgrade template to weaponsmith, armoursmith, or toolsmith for four netherite scraps.
### 1.21
- Debuffed the Wither
  - It now only has 150 health and does not regen.
  - This was done to counter the lack of protection and sharpness enchantments on the server.
- Added gear to the enchantable tags 
### 1.22
- Patched toolsmiths and weaponsmiths taking diamonds for netherite instead of upgrade templates for netherite
### 1.23
- Removed wither nerfs and diamond/netherite changes, as Durtle Empire Season 3 has ended
- Changed Hez Happy Music disc's texture
- Added 5 music discs, with music from Liam Vickers and one from Rick Astley
  - Door Guy's Theme
  - Gat Ritzy's Continuance Cube
  - ELIMINATE!
  - Jazz Cube
  - Never Gonna Give You Up
