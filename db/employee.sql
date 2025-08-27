/****** Object:  Table [dbo].[employee]    Script Date: 27-08-2025 15:45:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee](
	[id] [bigint] NOT NULL,
	[age] [varchar](255) NULL,
	[name] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[employee] ([id], [age], [name]) VALUES (1, N'33', N'Pooja')
GO
INSERT [dbo].[employee] ([id], [age], [name]) VALUES (2, N'34', N'Amar')
GO
