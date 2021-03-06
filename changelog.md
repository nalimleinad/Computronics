==== 1.1.1 ====

  * ADDED: More Waila Integration
            - Tape Drives now show their current state in Waila
            - Locomotive Relays now show whether they are bound to a locomotive
  * FIXED: A pretty serious bug with the Cipher Block
  * FIXED: Waila integration
  * FIXED: Tape Drive's getState not properly returning the current state.

==== 1.1.0 ====

  * ADDED: Applied Energistics 2 integration: The Spatial IO port can now be accessed using ComputerCraft and OpenComputers!
  * ADDED: getRoutingTableTitle and setRoutingTableTitle to the Routing Detector and Routing Switch Motor
  * ADDED: getName to the Locomotive Relay

==== 1.0.7 ====

  * FIXED: Robot upgrades crashing when not used inside robot.

==== 1.0.6 ====

  * CHANGED: Locomotive Relays should now remember the locomotive they are bound to through chunk unloading properly.
  * FIXED: GregTech Battery Buffer not being recognized by OpenComputers if placed after the adjacent adapter was.
  * FIXED: Electric Tracks not being regognized as peripherals/components

==== 1.0.5 ====

  * FIXED: Some weird Crash with GregTech

==== 1.0.4 ====

  * ADDED: You can now read charge and loss of Railcraft's Electric Blocks using OpenComputers or ComputerCraft!  
            - Note: Apparently the Electric Track can only be connected to using OpenComputers, the other electric blocks work fine with OpenComputers and ComputerCraft.
  * FIXED: Forge log getting spammed with errors regarding Applied Energistics 2
  * FIXED: Radar not working when used with ComputerCraft (Thanks to Grovert11 for finding the bug)

==== 1.0.3 ====

  * FIXED: Chat Boxes crashing when OpenComputers is not installed (thanks to Grovert11 for finding the bug)
  * FIXED: Chat Box Names not being set properly (thanks to Grovert11 for finding this as well)
  * FIXED: Locomotive Relay's getDestination returning the same as getMode (once again thanks to Grovert11)

==== 1.0.2 ====

  * FIXED: EVERYTHING!

==== 1.0.1 ====

  * FIXED: RailCraft stuff breaking everything without RailCraft installed.

==== 1.0.0 ====

  **Yes, this is what you should think it is, this is the version 1.0.0, so the first actual full release. Prepare for a lot of new stuff:**

  * ADDED: RailCraft integration, courtesy of Vexatos! Routing can now be fully controlled with computers!  
            - Routing Tracks can now be accessed using the Adapter Block  
            - Routing Detectors can now be accessed using the Adapter Block  
            - Routing Switch Motors can now be accessed using the Adapter Block  
            - Signal Receiver Boxes can now be accessed using the Adapter Block  
            - Added the Digital Locomotive Relay to access Electric Locomotives remotely  
            - Added the Digital Relay Sensor to bind a relay to a locomotive  
  * ADDED: GregTech integration  
            - Machine monitoring  
            - Digital Chests support  
            - Battery Buffer support (make sure to place the adapter after you placed the battery buffer!)  
            - Added a new virtually indestructable high-end tape using GregTech materials!  
            - Added a GregTech recipe mode for all the Computronics blocks and items (Thanks to SpwnX for helping with this)  
  * ADDED: New fancy Achievements for Computronics and its GregTech and Railcraft integration
  * ADDED: New French (AegisLesha) and Chinese (crafteverywhere) translations.
  * ADDED: ITapeStorage API - developers can now create their own compatible tapes and tape devices.
  * ADDED: tape.lua to tape drives - a utility program to write songs to tapes (from a hard drive or the Internet) and to play, stop, pause etc. songs
  * ADDED: BetterStorage 0.10+ compatibility for Storage Crate drivers.
  * ADDED: Radars now use energy uniformly for OC, CC turtles (coal) and ComputerCraft itself (MJ, RF or EU).
  * ADDED: Changed Cipher Block behaviour:  
            - Cipher Blocks can now be locked - their inventory is not accessible via automation or manually while they are locked. They can still be broken, though!  
            - Each side of the Cipher Block now corresponds to one of its six slots.  
  * REMOVED: Project: Red CC redstone integration - it's now improved and inside P:Red itself!
  * FIXED: Disabling the Chat Box will now disable the (potentially lag-inducing on large server) Chat Box event code.
  * FIXED: OC 1.2 will now give an error message when used. (YES, USE OC 1.3, IT'S BETTER)
  * MISC: Rewritten parts of the TE code to use the new AsieLib 0.3.0 methods.

==== 0.6.4 (13 August 2014 [1.7.2, 1.7.10]) ====

  * ADDED: You can set chat box names with getName() and setName().
  * ADDED: Improved German and Russian translations, by Vexatos and Adaptivity respectively.
  * FIXED: distanceUp() and distanceDown() in camera robots. For real. I actually tested it this time. It works.
  * FIXED: Potential CC issues with Lamps. (thanks GyroW)
  * FIXED: Wired Modems from CC can now be used on Lamps. (thanks GyroW)
  * FIXED: Radars and Radar Upgrades in OpenComputers now work again!
  * WARNING: Apparently, there never was a 0.6.3. Whatever.

==== 0.6.2 (1 August 2014 [1.7.2, 1.7.10]) ====

  * ADDED: Factorization Charge Conductor support!
  * ADDED: FSP Steam Transporter support!
  * ADDED: MFR RedNet support for Cipher Blocks!
  * WARNING: Mod compatibility configs have changed - if you disabled something added in 0.6.0 or 0.6.1, you might need to disable it again.

==== 0.6.1 (25 July 2014 [1.7.2, 1.7.10]) ====

  * ADDED: Deep Storage Unit API support for CC and OpenC (read: JABBA barrels)
  * FIXED: Fixed a boot crash when not having Project: Red installed. (This might feel ironic for some people who know me better.)

==== 0.6.0 (//Compatible Edition//) (25 July 2014 [1.7.2, 1.7.10]) ====

  * ADDED: Colorful Lamps! Supporting ComputerCraft, OpenComputers, NedoComputers, Project: Red, MineFactory Reloaded //and// RedLogic for setting their colour!
  * ADDED: Reading Bundled Cable output for RedLogic and Project:Red-compilant Bundled Cables in ComputerCraft is now possible! (Writing for RedLogic might come soon; writing for Project: Red is impossible due to P:Red's restrictive license)
  * ADDED: Cipher Blocks now support encryption via RedLogic and Project: Red bundled cables!
  * ADDED: Iron Note Blocks now support RedLogic, Project: Red and MFR for playback!
  * ADDED: BetterStorage crates can now have their contents read by OpenComputers!
  * ADDED: Chat Boxes now should emit a redstone pulse on every message sent on the chat.

==== 0.5.2 (24 July 2014 [1.7.2, 1.7.10]) ====

  * ADDED: EEPROM readers! Only active when NedoComputers is also installed, they let you read from and write to initialized NedoComputers EEPROMs.
  * ADDED: RedLogic lamps as peripherals! Because why not?
  * CHANGED: Iron Note Blocks now use the block under them for choosing the default instrument, instead of hardcoding a single instrument.
  * FIXED: Iron Note Blocks now emit Forge events for noteblocks. Sometimes.
  * FIXED: Cameras should now work a little bit better. They're still broken for distanceUp() and distanceDown(), but at least should not break for distance().

==== 0.5.1 (9 July 2014 [1.7.2, 1.7.10]) ====

  * ADDED: Cipher Block support for NedoComputers.
  * ADDED: Particle Turtle Upgrades for ComputerCraft.
  * FIXED: Allow setting bus IDs for NedoComputers. With NedoC installed, sneak-right-click with an empty hand on any Computronics peripheral.
  * FIXED: Robot Camera Upgrades now work again.
  * FIXED: The Tape Drive GUI finally works in 1.7.

==== 0.5.0 (8 July 2014 [1.7.2, 1.7.10]) ====

  * ADDED: Full ComputerCraft 1.64pr3 support using the native APIs!
  * ADDED: Partial NedoComputers support (Cameras, Iron Note Blocks, Tape Drives)
  * ADDED: Configuration options - configurable tape lengths
  * ADDED: Radars! They detect entities. And players. And... that's about it.
  * ADDED: Chat Box and Radar Upgrades for OpenComputers Robots.
  * ADDED: Speaking, Musical and Radar Turtle Upgrades (ComputerCraft)! [UNTESTED - waiting for CC for 1.7.10]
  * ADDED: Tapes can now have labels changed in CC Disk Drives. (Why not?)
  * ADDED: Chat Boxes can now have an optional second parameter to say() - the distance.
  * ADDED: Particle Effect Cards for OpenComputers - spawn particles all you want!
  * FIXED: Cameras should now work. Really. Please work ;_;
  * FIXED: Chat Boxes can now be connected using OpenComputers cables.
  * FIXED: Iron Note Blocks work in OC (again)
  * FIXED: Volume and speed settings in Tape Drives.
  * FIXED: For those of you who don't use OpenComputers, a few more peripherals will now become tickless! (Chat Boxes, Cipher Blocks)
  * REMOVED: OpenPeripheral support, we hook directly into ComputerCraft now!
  * REMOVED: A lot of junk code from ages ago.

==== 0.4.2 (30 May 2014 [1.7.2]) ====

  * [Techokami] New version of Nether Star Tape added: crafted with 4 Nether Stars and one tape track, it is capable of holding 128 minutes of audio, or enough data to properly accommodate a FAT16 partition.
  * [Techokami] Fixed crash bug related to Tape Drives (speed, volume settings).

==== 0.4.1 (28 May 2014 [1.7.2]) ====

  * [Techokami] Ported to 1.7.2.

==== 0.4.1 (27 April 2014 [1.6.4]) ====

  * Added: Russian translation by dangranos.
  * Fixed: Tape Drive GUIs now work again.

==== 0.4.0 (27 April 2014 [1.6.4]) ====

  * Warning: Needs AsieLib 0.2.3+
  * Added: Creative Chat Boxes! You can now pretend you're the NSA! (No distance limits, only one dimension, works with / commands too.)
  * Added: More tape types: Nether Star, Copper and Steel.
  * Added: GregTech compatibility.
  * Added: Chat Boxes now log /me commands.
  * Added: A few more configuration options.
  * Added: You can now set the volume of your Tape Drive using a computer.
  * Fixed: The Robot Camera Upgrade now functions properly.
  * Fixed: Proper CC 1.6 support now! I think.

==== 0.3.2 (17 April 2014 [1.6.4]) ====

  * Added: distanceUp() and distanceDown() for the Robot camera upgrade.
  * Fixed: Some fixes or other. I don't remember what exactly.

==== 0.3.1 (5 April 2014 [1.6.4]) ====

  * Warning: Needs AsieLib 0.2.1+
  * Added: Chat Box getDistance() and setDistance() in 1.6.4, for OC and CC.
  * Added: Cipher Block crafting recipe! I forgot!
  * Added: setSpeed() to Tape Drives, letting you set the speed from 0.25x to 2.0x!

==== 0.3.0 (5 April 2014) ====

  * WARNING: Needs AsieLib 0.2.0+ AND a snapshot version of OpenPeripheralCore (for ComputerCraft support)!
  * [1.7.2] Added: getDistance() and setDistance() to Chat Boxes, setting their listening distance (will backport to 1.6 in 0.3.1!)
  * Added: ComputerCraft 1.6+ support!
  * Added: Cipher Block - encrypts and decrypts messages!
  * Added: Cameras now look up and down in addition to the 4 sides.

==== 0.2.4 (23 March 2014) ====

  * Ported to Minecraft 1.7.2.
  * Fixed: Cameras giving mirrored output in two of the four directions.

==== 0.2.3 (17 March 2014) ====

  * Fixed: Bug where Chat Boxes not connected to an OC computer could crash the server.

==== 0.2.2 (15 March 2014) ====

  * Changed: Split off AsieLib into a separate mod.
  * Fixed: Now works on dedicated servers.
  * Fixed: Rewinding and fast-forwarding will now not repeat the rewind sound (and never stop it).

==== 0.2.1 (14th March 2014) ====

  * Added: getState() to get the current state of the Tape Drive.
  * Fixed: An NPE when clicking on a machine with an empty hand. (Yes, I don't know how I missed that one either)

==== 0.2.0 (14th March 2014 - Happy Pi Day!) ====

  * Added: A rewrite of the Tape Drive mechanics.
    * Tape Drives now remember their state on unload (persistence!).
    * [[http://i.imgur.com/FCFiPfd.png|A slick new GUI]] - makes it possible to use Tape Drives without computers!
    * Tape Drive playback can be controlled with redstone.
  * Added: Tape Drives and Cameras can now be rotated with BuildCraft or compatible wrenches.
  * Added: Iron Note Blocks support the two noteblock sounds that are in the Minecraft assets/ folder but were never used ("pling" and "bass", respectively).

==== 0.1.5 (12 March 2014) ====

  * Added: The tape eject sound is now played on... tape eject.
  * Fixed: Chat Boxes crashed if OpenComputers was not installed.

==== 0.1.4 (12 March 2014) ====

  * Added: Better Camera accuracy - it now gives correct shapes for blocks, as well as has higher accuracy for distance values. Thanks to Sangar!
  * Added: Camera Redstone support - Cameras now output a redstone signal related to the distance of the block in front of them.
  * Added: German translation (thanks, Vexatos!)

==== 0.1.3 (11 March 2014) ====

  * Added: Polish translation.
  * Fixed: Cameras now /really/ work properly.

==== 0.1.2 (11 March 2014) ====

  * Added: Wonderful new textures by **ping**.
  * Added: Chat Boxes! They let you send and receive messages.
  * Added: (OpenComputers only) Robot Camera Upgrades! You can now add Cameras to OC robots.
  * Tweaked: A custom creative tab.
  * Tweaked: Camera improvements!
    * (OpenComputers only) Cameras now output block data: a unique hash of the ID, as well as the light distance. The feature will be added to ComputerCraft at a later date.
    * The distance value's accuracy has been somewhat tweaked.

==== 0.1.1 (9 March 2014) ====

  * First official release.
