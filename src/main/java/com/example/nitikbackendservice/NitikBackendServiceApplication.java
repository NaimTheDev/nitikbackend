package com.example.nitikbackendservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NitikBackendServiceApplication implements CommandLineRunner {
	@Autowired
	PoemRepository repository;

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/poems");

		SpringApplication.run(NitikBackendServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		deleteAll();
		addSampleData();
	}
	public void deleteAll(){
		System.out.println("Deleting All Poems...");
		repository.deleteAll();
	}
	public void addSampleData(){
		repository.save(new Poem( "If I Am Fortunate Enough To Have A Daughter","if I am fortunate enough to have a daughter I will warn her of the hurricane coming her way if she is anything like me that is I'm a part of generation Y as in why must I explain to her that her hijab retells the tragic tales of every everything ISIS and al-Qaeda have done or that the language of the pirates that hail from her homeland is so similar to her mother tongue or why I must teach her to walk faster at night rather than teaching her brother to keep his hands to himself my daughter will fit into three different categories of oppression all of them saturated with their fair share of stereotypes now if that's not a blessing, then I don't know what is or should I say a blessing in disguise because behind those beautiful eyes hides a mind much more powerful than society's lies she will see that the best things in life are things that money cannot buy like how she is a natural masterpiece that doesn't need to spend thousands on cosmetics and surgeries and not even Photoshop or facetune can come close to imitating the beauty bestowed upon her by her Creator the same Creator that her mom prays to 5 times a day not to be confused with a creator that enforces terrorism, by the way my daughter will know that she is worth much more than what the world will make her think because her worth won't be in the number of boys that want her or the number of girls that want to be her but in the number of books she's read and the way her eyes light up when she talks about her favorite characters she will learn that society isn't as accepting as they make it seem and life isn't as glamorous as it is sometimes painted out to be and despite the fact that she is a minority she is still good enough to have her face on TV and she will know I promise she will know that she is not responsible for every mistake that someone that looks like her makes and her hijab was fashionable before celebrities put it on to make a statement not everything on Instagram is what she wants to be and she is free to be anything she wants to be that's one of the biggest perks of living in this free country the only thing holding her back are the people on her phone screen but no worries, she will have me if I am fortunate enough to have a daughter I will teach her all of the things that nobody taught me"));
		repository.save(new Poem("Dear Child of Immigrant Parents","dear child of immigrant parents, growing up in the free world, it is far too easy to fall into the dangers of assimilation altering your beliefs so you can fit into a lifestyle of self-degradation self-destruction eradication of a culture that those before you spent generations handcrafting growing up in the free world, they will make you feel like everything you were ever taught was wrong and no matter how hard you try, you will never belong you can try to memorize and copy their actions like it's your favorite song but as long as you're the one singing, they will never sing along I know you will never know what it feels like to completely belong anywhere wandering continuously through a gray area between two extremes of black and white where you are too foreign for the Americans and too American for your own you fight a constant inner battle between who you are and who you should be while they remind you that just another foreigner is all you ever will be and they say you don't belong in the land of the free and the home of the brave little do they know there is nobody more brave than the man and woman that gave you lifethe people that left everything behind for the sake of a child that could potentially grow up only to turn around and bite the hands that fed them the same hands that were worn down by a cold world and a war torn country that are still being raised to worship the One worth being worshiped those hands are worth more than any amount of embarrassment you felt when they mocked the accent of your mother it was thick, yet sweet like honey they didn't know it was the only part of home she has left the abuse your strong father had to endure at work to simply ensure that your family had enough food on the table they didn't know that he has enough knowledge to fill a library of a thousand books cover to cover it's time to discover the beauty of the place you came from a country that the world once came to see a land, an empire built on a beautiful story and a beautiful people to match with their sun-kissed skin and winding curls a look that people spend thousands to achieve but to your people, it was given naturally and don't even get me started on their tight grasp on poetry dear child of immigrant parents, do not let the efforts of your parents go to waste amidst the embarrassment they made you feel for coming from something different do not let it escape your memory that your parents gave up all that they knew with the intention of creating a better life for you your parents didn't give up their hopes and dreams just for you to completely disregard your culture and your deen you don't need to fall victim to unnecessary erasure you don't need to go against your morals for temporary acceptance and pleasure go ahead, take advantage of the free world and all it has to offer take the opportunities reap the benefits reach your full potential and then some but dear child of immigrant parents, please don't forget where you came from  "));
		repository.save(new Poem("My Women","my women have fought a fair amount of wars from bullets and bombs to bigotry and bans and even battles within their own heads my women have encountered monsters far beyond our worst night terrors from men who look like her father carrying guns loaded with ammunition to politicians in nice suits demoralizing her with legislation and even the voices of the demons in her mind that she was told were just her imagination my women put their needs on the back burner to raise my generation if you educate a man, you educate a person if you educate a woman, you educate a family but the world has failed to educate my women on what it means to be genuinely healthy they were taught traits like manners, obedience, softspokeness, and modesty but how my women were feeling was never made a priority their feet ached from carrying the weight of the world on their shoulders their hearts were filled with the pain of yearning to be home their bodies were tired of being under someone else's control for so long their eyes stung from watching their country deteriorate everyday their mental health was dismissed by the words just pray my women will never tell you any of this because nobody ever asked them if they were okay" ));
		repository.save(new Poem(  "Royalty", "when I speak of us, I speak of royalty I speak of kings and queens descended from poets and masters of creativity I feel the passion and patriotism of those that came long before you and me even though we don't share the same story our culture runs deep through our veins as if our blood was made was made from the water of the Indian ocean and the red sand of Mogadishu herself we can't help but to feel homesick for a place that we may have never been we can't help but to feel like half of our hearts resides in a place we may have never seen when we read the news of tragedy from the safety of our Western homes we can't help but to feel helpless and guilty when five hundred of our brothers and sisters were slain in our homeland it shook us to our core and haunts us to this day because all we could do was read about it on our phones and pray when I speak of us I speak of a people with deen a people woven so tightly with Islam that sabr has become second nature for us but God only tests the ones He loves may our people that suffered be rewarded with all they never had in this life in heaven above may we make our our parents and grandparents proud by educating ourselves and taking back what we learned to build Somalia up from the ground I sometimes wonder how a kingdom can be so big and diverse yet our bond be so strong we were born all around the world from Kismaayo to Columbus our skin ranges from elegant fair shades to the most gorgeous darker complexions some of us have lived half of our lives back home while others have yet to board a plane we speak a thousand different dialects though everything we're trying to say is the same Somalia ha noolato ilahay nabad iyo barwaaqo hano keeno when I speak of us I speak of royalty I speak of a people of resilience, love, and loyalty"));
		repository.save(new Poem("Dear God","dear God, I'm sorry that I complain a lot I'm sorry that I complain so much that sometimes I don't even realize that I'm doing it it's scary how my negativity seems to come so naturally I heard that's one of the devil's strongest qualities he can make me feel like my biggest blessings are empty like opening my eyes in the morning with no deaths to be mourning my card loaded with enough money to feed me for the day my body healthy enough for me to get on my knees and pray these are things I should be excited about, right? these are things that should always make me feel alright but instead I'm thinking about how bad the weather is or that fight with my parents if only I remembered how much You love me throughout the day I bet I would feel so stupid I would feel so dumb for letting the actions of others shake me I would let things that are beyond my control slide and I would take people's negative comments in stride it's incredibly easy to shout \"deen over dunya\" but it's so much harder to live by if only I realized that only You know what's best for me I probably wouldn't stress the little things I would be patient and wait for what's in store for me dear God, out of all the planners in the world, you are the best and with that in mind, I can peacefully rest\n "));
		repository.save(new Poem("Love Letter", "once upon a time, you walked into my life and made it bright your rays of light broke through my darkness of night your smile lit up my world and quickly became my favorite sight your kindness and warmth surrounded me and talking to you made me feel like everything was alright my spirits were lifted and my stressful days disappeared out of all the things I've achieved in my nineteen years meeting you is still undefeated you can deny a lot of things but you can't deny our instant connection I'm not big on using the L word but for you I might make an exception I find myself thinking about our conversations throughout my day and I'm still amazed at how you always know exactly what to say I'm sure a lot of people can relate to someone making them feel this way and I'm trying to express my own feelings in the best way I can so before you ask, no I would never embarrass myself in here and confess my love to a man this poem is dedicated to no one other than my best friend the girl that can make me laugh like nobody else can she talks me through crisis after crisis\n the Prophet saw once said \"Keep company of a believer only and let your food be eaten only by the righteous.\" and she reminds of God when I'm at my lowest and when even I'm at my highest they say that friends are family members that we pick ourselves but I'm sure that choice was never up to me because our names must have been written together long before either of us knew of our destiny she never judges me regardless of the mistakes I make and she's the only one that knows how to piece me together after every heartbreak I have a bad habit of not telling people that I care about them until it's too late so I hope my appreciation shines through in this letter once upon a time, two separate beautiful worlds collided to create something better and ten years ago you walked into my life and changed it forever\n"));
		repository.save(new Poem("Bittersweet","you are dangerous in more ways than one and now it's clear to me that I should have listened when they told me to turn and run I remember every single promise that you sang to me so beautifully our time together was like riding an endless rollercoaster despite not being tall enough, I stood in line and snuck on never knowing what was next to come it was constant loops of you repeatedly shattering my heart and watching as I attempt to pick up the pieces of glass my hands dripping with blood you would simply say to me, \"I'm sorry\" and suddenly the wounds that you caused would magically disappear you were both the cause and healer of my scars blindly, I would end up accepting your insincere apology until one day I grew exhausted I was tired of repeatedly building myself up only for you to selfishly knock me down I was tired of writing volumes and volumes for you to barely write me a sentence in return I was tired of trying to win your impossible competition that you changed the rules to everyday I guess that everyone except me and my naive optimism seemed to know that I was just another victim of your evil game it hurts even more to think that I am the sole person to blame\n because now I'm left on my own to feel the pain every time I hear your name my heart falls out of my chest my good mood fades away and I have to go on about my day and pretend like everything is okay meanwhile, I'm sure this was all easy for you one day you got tired of hearing me complain so you turned your face and walked away I guess this is all bittersweet because now I know that I'm better off alone than with you maybe it's good for me that we're through now I have my whole life ahead of me to be happy and stress free I'll never let the hurt you caused changed my heart if only I found out who you really were earlier I would have protected myself from the start"));
		repository.save(new Poem("Anxiety", "I don't know what's wrong with me lately it's like my mind has a heart of it's own my professor just said my heart is the part of my body that works the hardest to keep me alive but it feels more like it's trying to make me die beating at a speed of 100 mph out of my chest I read online that I should try and control my breath so I inhale and hold for 5 seconds like they said then I exhale and feel okay for a little while but not even a few minutes pass before I'm back in my own head over analyzing, stressing, panicking over dramatic over sensitive over absolutely nothing this feeling isn't new to me but it used to be so few and far between these days I can't go a few hours without feeling like the sky is falling like the Earth is cracking like my source of oxygen has been taken away like my heart has sunk to my feet my mind is already working against me before I open my eyes most mornings I don't even get the chance to thank God before my soul feels like it's being lifted out of me that's no way for me to start my day I'm trying my hardest to stay positive and remind myself that I will come out of this fine I know that I will I just wish I could convince my mind\n"));
		repository.save(new Poem("Now I Know: To Who I Thought Was My First Love", "I called you my first love but looking back that was silly 15 year old me knew nothing about anything let alone love and responsibility I was running fast on a path that kept circling back around and I hated you for a lot of things, but that's not what this poem is about our childish relationship showed me that I shouldn't hold on to things purely out of fear of letting go and in more ways than one you showed me the power of saying no we were only kids and maybe I expected too much from you maybe I put too much faith in you maybe I confused my hopes and dreams with what was really true you were never big on listening to anything I had to say but your deafness only increased the volume of the voice inside my heart I hear it loud and clear now and now I know not to let things that happened in the past tear me apart"));
		repository.save(new Poem("Now I Know:To My First Male Friend", "I don't have many good things to say about you but I'll try my best to be kind and honest there was nothing romantic about us and honestly, love isn't a word that I will ever use to describe us I was nice enough to let you in as a friend but then you take advantage of my kindness and pushed me to my wit's end I don't know what wars you were fighting in your own head and I'm sorry that your life turned out the way it did in the end I tolerated a lot from you because for some reason I always felt guilty I guess a miskeen girl was an easy resting place to unload your anger but still, I thank you for the lesson that you taught me that I should never let my soft heart be a punching bag for a bully and now I know that it's not my job to fix everybody"));
		repository.save(new Poem("Now I Know: To The First Heart I Broke", "unlike the others it's easy to separate to the good and bad things to say about you I was your first love and for that I will always be honored the timing was off and I'm sorry if I ever made you think I was bothered our time together is beautiful and I wouldn't erase it for the world you taught me there's good guys out there at a time when I believed there to be none we both have our flaws and when we put them aside, it's magical but we are way too young to be changing ourselves to fit into each other's worlds you're still my best friend but being together would never be easy I'm bad at telling you this but putting so much effort into you took a lot out of me I wish things could have gone differently because I know how much this hurts you I really hope that anything I said didn't change you for the worse now I know that there's always going to be a heavy price to pay when I put myself first"));
		repository.save(new Poem("Now I Know: To The Person Currently On My Mind","I feel the need to include you and I don't know why but talking to you sparked something that I hadn't felt in a while our whole situation was very confusing and I'm still not sure how to explain it I'm appreciative of you for making me laugh at a time of high stress you made a stranger feel like a priority and you showered me with kindness you turned a summer that was supposed to be a nightmare into a movie scene I'm sorry if anything I did to you was ever mean my rudeness is a symptom of fear and I guess it was just nice to have someone new as a listening ear regardless of how you feel about me, I want to thank you for making me smile now I know that someone you knew so briefly can have an effect on you for a while"));
		repository.save(new Poem("Now I Know: To My First Real Love","you're the most important man in my life and nobody will ever take your place you set an example that's going to be impossible to replace my eyes water at the thought of ever losing you because I don't think anyone is closer to my heart than you are you're the reason why I set the standard for these boys so high even when your life got hard you never left me high and dry I doubt a lot of things you say but you always end up being correct I promise that even when I find the one for me our relationship is something I will never neglect it took me some time to realize this and I will never be able to thank you enough for this lesson you were my best friend since the day I arrived on this Earth and because of you, now I know my worth"));
		repository.save(new Poem("Nostalgia","I remember sitting in the cafeteria with my best friends so excited for the school day to end tears of laughter and innocence smiling for a million reasons I wish I would have treasured those moments more we were so ready to grow up not realizing that the grown up world is nothing like we thought it would be fast forward to college and those same big smiles are still plastered on our faces not sure who we're going to meet tomorrow and if they will take us to new places sometimes I wish I could slow down time just because I know that someday we'll all be busy with our own lives and we won't have time to sit around and talk about every little thing I hope we all amount to something, God willing and that all of our hard work and stress won't be for nothing I remember fighting with my sisters thinking we were all the same age taking mental notes of everything they did and trying my best to learn from their mistakes I don't think I ever told them how much younger me looked up to them and how older me constantly compares myself to them to them, I will always be a little kid they have no idea that I'm the person I am today because all of the things they did I wish that we could all be a little closer I wish that innocent fights never turned into full on wars I know that keeping in touch gets harder as we get older but all I ask is that we try because ultimately all we have is each other I remember running around my parents' restaurant while the girls were at school it used to be just us three I learned a lot of things early on from our little family things I sometimes wish I could have taken a rain check on but before I even think about opening my mouth to complain I have to remember that even parents aren't immune to pain raising five children far away from home doing it all on your own no family or friends to help ease the load even when you were doubted and faced with temptation, you did it morally the hardest workers I will ever know you showed me that halal success is a possibility I know that raising us wasn't easy but you did your best to give me the beautiful life I have today flaws and all, I'm so thankful that I was raised in your kingdom and I pray that God lets you both live long enough to see the woman I become I remember when things were simple my worries small and insignificant I would sit in front of the television watching Disney Channel for hours regular teenage girls that were secretly celebrities and normal human beings with superpowers I look back on those days and wish that there was a way for me to build a time machine to go back to when everything was so easy nostalgia has funny way of making yesterday seem better than today but from what I can see today is turning out lovely I'm surrounded by laughter and love God taking care of me from above I can't imagine ever asking for anything else I have more than enough"));
		repository.save(new Poem("Conclusion","The past nineteen years have been such a beautiful, crazy learning experience. I learned so much about my people, my religion, friendship, love, and myself. I really hope these lessons have been made evident throughout this book. My favorite thing about writing is that it gives me the power to look back on situations in my life and feel exactly what I felt in the moment that I wrote it. Sometimes I laugh, sometimes I feel grateful, sometimes I cringe, sometimes I literally want to cry my eyes out. But I'm always glad that I wrote it down. As a matter of fact, I've never regretted writing anything. Not even once. I would like to carry that sentiment into my personal life. There have been and always will be situations that I wish I could forget. Situations where I look back and think \"Why did I ever do that? What made me want to put myself in that position? What did I gain?\" Well, the answer is simple. Nothing is worth regretting because every experience, good and bad, teaches you something that you otherwise would have probably never learned had you not gone through it yourself. And that's just the cold hard facts. The thought of turning twenty has always scared me a little bit. Two decades is an extremely long time and it feels even longer. Writing a book has been a dream of mine since I was a kid. I never thought I would do at the age of nineteen. But honestly, what better time to do it than now? I am at the perfect crossroads between who I am and who I am becoming. I don't think I know everything but my experiences up to this point have definitely set me up for an exciting decade to come. That's something worth documenting if you ask me. Rest assured, I am still pretty clueless about this whole adulthood thing. They say the best years are ahead of me but they also said that about my teenage years. So I don't know. I guess we'll see. I hope this was an enjoyable read. All I ever want is to make people feel the way my favorite writers and poets make me feel. I know I'm not the best writer. Not even close. But I do put my whole entire heart and soul into everything I write. Not everybody can confidently say that about themselves. So yeah, I did it. I wrote a whole entire poetry book and I don't think I have ever been more proud of anything in my whole entire life. Writing things down has always been a coping mechanism for me. I never knew where it would take me or what it would do for me. But now, I think I know."));
	}








}
