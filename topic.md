Course -Spring Microservices + Restful Services

Duration - 5 days

(It is manadatory to complete the training prerequisites before nominating for the session)

 Prerequisites:Spring Dependency Injection using XML and Java Configuration,Spring MVc Basics,Basic understanding on REST Architectural principles.

Course Outline:

DAY 1

Introduction to MicroServices

Problems with Monolithic Application
What and Why Microservices ?
Advantages and disadvantages of microservices
Use case for MicroServices
Domain Driven design
JAVA CONFIGURATION

Java Configuration
AnnotationConfig Application Context
@Configuration, @Bean, @Import, @Scope
@PropertySources
Using Environment to retrieve properties
LAB -  Using Java Configuration

Spring Boot Introduction

What is Spring Boot?
Spring boot maven dependencies
@EnableAutoConfiguration
What is @EnableAutoConfiguration is doing behind the scenes
Diving Deep into various AutoConfiguration classes
@SpringBootApplication
Externalizing configuration in Spring Boot
Accessing Command line properties
Application properties
@Configuration Properties
Configuring DataSource using Boot
TypeSafe Configuration Properties
LAB -  Using  Spring Boot
Spring MVC REST using Boot

Basics of REST
Discussion on REST Architectural principles
@ResponseBody
@RequestBody
DAY2

HttpMessageConverters
Content Negotiation
Exception Handling
Pagination
Http Entity
ResponseEntity
Client using Rest Template
UriBuilder
LAB -  Implementing and Consuming Restful Services


Spring Cloud

Overview of Spring cloud and its modules
Spring Cloud Eureka

Why DiscoveryServer?
Client side load balancing
How to Create a Eureka Server using @EnableEurekaServer or @EnableDiscoveryServer
How to register Eureka Client using @EnableEurekaClient or @EnableDiscoveryClient
How to look up a service from Eureka Server
Configuring a cluster of eureka servers
LAB : Using Eureka Server and Client

LAB : Configuring Eureka  cluster

DAY 3

Spring Cloud Ribbon

Why ClientSide Load Balancing?
What is ribbon and how to use spring ribbon?
Using LoadBalanced RestTemplate
Configuring Retries
Using different Load balancing algorithms
LAB : Implementing Client side load balancing using ribbon

Spring Cloud Hystrix

What is a circuit breaker?
Using Hystrix with Ribbon
Various Hystrix configurations
Hystrix Dashboard for monitoring
LAB : Using Hystrix as circuit breaker

LAB : Using Hystrix Dashboard

Spring Cloud Feign

What is a Feign?
Implementing REST Clients in declarative approach
Configuring Fallbacks using feign
Hystrix configurations when using feign
LAB : Implementing REST Client using Feign

API Gateway and ZUUL

Why API Gateway?
What is ZUUL ?
Disabling access to some services at zuul level
Using Zuul Filters
LAB : Using ZUUL to enable Proxying microservices

DAY 4

Spring Cloud Config

Configuring Server and client pointing to configuration file in github
@EnableConfigServer
HTTP, resource-based API for external configuration
Lab : Using Configuration file configured in github

Docker Basics and Deploying Microservices with Docker

What is Docker and how it works?
Creating a docker image
Running a Java App inside docker container
Deploying Static Web Application using docker
Understanding Docker compose
Deploying Microservices using Docke
Introduction to ELK Stack

Introduction to Logstash
Configuring input and output pipelines
Introduction to ElasticSearch and Kibana
Starting a Docker container which has ELK Stack
Configuring a Spring application to send logs to Logstash
Configuring ElasticSearch and Kibana to visualize logs from logstash
LAB : Using ELK Stack



Spring Cloud Sleuth

 What is Sleuth?
How to use Sleuth for log tracing
Streaming the Logs to Zipkin
Analyzing logs using Zipkin
LAB : Using Sleuth and zipkin

Spring  MicroService Testing

DAY 5

Spring Security and Oauth

How Spring Security works?
Various filters and their uses
Configuring Spring Security using Java Config for Web App
What is Oauth2 and How does it work?
4 Grant types in Oauth2
Securing Rest Services using Password Grant Type
Consuming a secured Rest Service using Oauth2RestTemplate
Applying Security to Zuul proxy
Implementing Message driven microservices using Spring Cloud Stream

Declaring and Binding Channels
Source, Sink, Processor
@Stream Listener, @Input and @Output
Binder detection
Binder Configuration Properties
Partitionin
Lab : Implementing event driven microservices using cloud stream

Discussion on PolyGlot Persistence

Implementing  CQRS and EventSourcing

 What and Why CQRS ?
Advantages of CQRS
Discussion on EventSourcing
Lab : Implementing CQRS

 Kubernetes Basics

What is kubernetes?
Discussion on various components in kubernetes
Installing kubernetes
Kops
Kubeclient
Configuing Pod in kubernetes
Using Replication Controller
Confuring and addning deployment
LAB : Installing Kuberntes

LAB : Creating and using Pods

LAB : Creating and using Replication Controller

LAB : Creating and using Deployments 